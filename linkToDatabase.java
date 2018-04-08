package JDBCObject;

import java.sql.*;

public class linkToDatabase {

    //new a linkToDatabase Object;
    public linkToDatabase(String dataBaseDriver, String dataBaseUserName,
                          String dataBasePassWord, String dataBaseAddress) {
        this.setDataBaseDriver       (dataBaseDriver);
        this.setDataBaseUserName    (dataBaseUserName);
        this.setDataBasePassWord    (dataBasePassWord);
        this.setDataBaseAddress     (dataBaseAddress);
    }

    //setitng the Database
    public void settingDtabase() {
        try {
            //add database's diver;
            Class.forName(this.getDataBaseDriver());
            //get a connection ,the parameters is dataBase's address, dataBase's user name, database's user password;
            try {
                this.database_Link = DriverManager.getConnection(this.getDataBaseAddress(),
                        this.getDataBaseUserName(), this.getDataBasePassWord());
                //3.创建Statement对象   statement对象是数据库sql语句的载体，
                // 通过statement对象可以执行数据库访问的sql语句。。。
                // 使用statement对象执行insert、update、delete语句是调用executeUpdate()方法。
                // 该方法返回sql语句影响的行数。。
                this.dataBase_Stmt = this.database_Link.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // set resultSet
    public void palySQLIntructions() {
        try {
            // ResultSet rs = stmt.executeQuery(sql);
            Connection temp = this.getDatabase_Link() ;
            String sql = this.getSqlIntructions() ;
            this.dataBase_Stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void palySQLIntructionsForInsetInformation() {
        try {
            String sql = this.getSqlIntructions() ;
            this.dataBase_Stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void paly() throws SQLException {
        ResultSet tempResulSet = this.getDatabaseResultSet();
        while(tempResulSet.next()) {
            // Tables_in_tempfile
            String databaseName = tempResulSet.getString("Tables_in_tempfile");
            System.out.println(databaseName);
        }
    }

    //close all database files;
    public void closeDatabaseFile() {
        if (this.getDatabaseResultSet() != null) {
            try {
                this.getDatabaseResultSet().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if ( this.getDataBase_Stmt() != null) {
            try {
                this.getDatabase_Link().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (this.getDataBase_Stmt() != null) {
            try {
                this.getDatabase_Link().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // setting the Statement's from;
    public Statement getDataBase_Stmt() {
        return dataBase_Stmt;
    }

    // setting the Statement's from;
    public void setDataBase_Stmt(Statement dataBase_Stmt) {
        this.dataBase_Stmt = dataBase_Stmt;
    }

    //return the databaseDiver as a string;
    public String getDataBaseDriver() {
        return dataBaseDriver;
    }

    //setting dataBaseDiver
    public void setDataBaseDriver(String dataBaseDiver) {
        this.dataBaseDriver = dataBaseDiver;
    }

    //return the database user name as a string;
    public String getDataBaseUserName() {
        return dataBaseUserName;
    }

    //setting the database user name;
    public void setDataBaseUserName(String dataBaseUserName) {
        this.dataBaseUserName = dataBaseUserName;
    }

    //getting the database user password as a string;
    public String getDataBasePassWord() {
        return dataBasePassWord;
    }

    //setting the database user's password;
    public void setDataBasePassWord(String dataBasePassWord) {
        this.dataBasePassWord = dataBasePassWord;
    }

    //return the database's address;
    public String getDataBaseAddress() {
        return dataBaseAddress;
    }

    //setting the database's address;
    public void setDataBaseAddress(String dataBaseAddress) {
        this.dataBaseAddress = dataBaseAddress;
    }

    //getting sql inturcyion;
    public String getSqlIntructions() {
        return sqlIntructions;
    }

    // setting sql inturctions;
    public void setSqlIntructions(String sqlIntructions) {
        this.sqlIntructions = sqlIntructions;
    }

    // return the Connection Object;
    public Connection getDatabase_Link() {
        return database_Link;
    }

    // setting the Connection ;
    public void setDatabase_Link(Connection database_Link) {
        this.database_Link = database_Link;
    }

    // return the find set;
    public ResultSet getDatabaseResultSet() {
        return databaseResultSet;
    }

    // create data into the set;
    public void setDatabaseResultSet(ResultSet databaseResultSet) {
        this.databaseResultSet = databaseResultSet;
    }


    private     String          dataBaseDriver ;    // string for save database's diver;
    private     String          dataBaseUserName ;  // string for save database user name;
    private     String          dataBasePassWord ;  // String for save database passWord about database user ;
    private     String          dataBaseAddress ;   // String for save database address;
    private     Statement       dataBase_Stmt;      // create statement object;
    private     String          sqlIntructions;     // create String for SQL intructions;
    private     Connection      database_Link;      // create the database sql_intructions & java link;
    private     ResultSet       databaseResultSet ; //A set about SQL find
}
