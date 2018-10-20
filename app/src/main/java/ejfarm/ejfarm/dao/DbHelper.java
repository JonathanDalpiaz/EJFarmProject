package ejfarm.ejfarm.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Date;

public class DbHelper extends SQLiteOpenHelper {


    private static final String NOME_BANCO = "ejfarm.db";
    private static final String TABELA = "DADOSPLANTIO";
    private static final String ID = "ID";
    private static final Integer QTDSEMENTES = 1;
    private static final String TPSEMENTE = "TIPOSEMENTES";
    private static final Date DATAPLANTIO = ;
    private static final int VERSAO = 1;


    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE"+TABELA+"("
                + ID + " integer primary key autoincrement,"
                + QTDSEMENTES + " text,"
                + DATAPLANTIO + "text,"
                + TPSEMENTE + " text,"
                + VERSAO + " text"
                +")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(db);

    }
}