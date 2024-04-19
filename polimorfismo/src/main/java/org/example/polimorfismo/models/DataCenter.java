package org.example.polimorfismo.models;

public class DataCenter {
    DB1 db1 = new DB1();
    DB2 db2 = new DB2();
    DB3 db3 = new DB3();

    public DB1 obtenerInfo(){
        return db1;
    }

    public DB2 obtenerInfo2(){
        return db2;
    }

    public DB3 obtenerInfo3(){
        return db3;
    }
}
