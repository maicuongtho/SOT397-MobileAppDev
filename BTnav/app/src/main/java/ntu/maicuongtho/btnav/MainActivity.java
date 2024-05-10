package ntu.maicuongtho.btnav;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bước 1. Tạo CSDL
        SQLiteDatabase dbBook;
        dbBook = openOrCreateDatabase("QLSach.db",
                                      MODE_PRIVATE, null );
        // chạy thử, và xem CSDL được tạo ra chưa
        // Bước 2. Tạo bảng
        String sqlXoaBangNeuDaCo ="DROP TABLE IF EXISTS Books;";
        dbBook.execSQL(sqlXoaBangNeuDaCo);
        String sqlTaoBang ="CREATE TABLE BOOKS(  id integer PRIMARY KEY, " +
                                                " name text, " +
                                                " page integer," +
                                                " price Float, " +
                                                " description text);";
        dbBook.execSQL(sqlTaoBang);
        // chạy thử, và xem bảng đã được tạo ra chưa
    }
}