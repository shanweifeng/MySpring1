package com.swf.pattern23.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:59 2017/8/4
 * @Modified By:
 */
public class ConnectionPool
{
    private Vector<Connection> pool;

    /*公有属性*/
    private String url = "jdbc:mysql://localhost:3306/ygg_admin";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 100;
    private static ConnectionPool instance = null;
    Connection conn = null;

    /*构造方法，做一些初始化工作*/
    private ConnectionPool() {
        pool = new Vector<Connection>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /* 返回连接到连接池 */
    public synchronized void release() {
        pool.add(conn);
    }

    /* 返回连接池中的一个数据库连接 */
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }

    public static void main(String[] args){
        ConnectionPool cp = new ConnectionPool();
        System.out.println("当前数据");
    }
}
