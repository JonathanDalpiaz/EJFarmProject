package ejfarm.ejfarm.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import org.androidannotations.annotations.EBean;

import java.sql.SQLException;

import ejfarm.ejfarm.model.Plantio;

@EBean
public class EJFarmDB extends OrmLiteSqliteOpenHelper {

    // name of the database file for your application -- change to something appropriate for your app
    private static final String DATABASE_NAME = "ejfarm.db";
    // any time you make changes to your database objects, you may have to increase the database version
    private static final int DATABASE_VERSION = 1;

    private Dao<Plantio, Integer> plantioDAO = null;

    public EJFarmDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        try {
            Log.i(EJFarmDB.class.getName(), "onCreate");
            TableUtils.createTable(connectionSource, Plantio.class);

        } catch (SQLException e) {
            Log.e(EJFarmDB.class.getName(), "Can't create database", e);
            throw new RuntimeException(e);
        }

        Log.i(EJFarmDB.class.getName(), "created new entries in onCreate!");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            Log.i(EJFarmDB.class.getName(), "onUpgrade");
            TableUtils.dropTable(connectionSource, Plantio.class, true);
            // after we drop the old databases, we create the new ones
            onCreate(db, connectionSource);
        } catch (SQLException e) {
            Log.e(EJFarmDB.class.getName(), "Can't drop databases", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        super.close();
        plantioDAO = null;
    }

    public Dao<Plantio, Integer> getPlantioDao() throws SQLException {
        if (plantioDAO == null) {
            plantioDAO = getDao(Plantio.class);
        }
        return plantioDAO;
    }
}
