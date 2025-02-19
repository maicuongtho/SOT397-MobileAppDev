package thigiuaky.maicuongtho.chuyenmanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // XML  onclick= ChuyenSangManHinh2
    public void ChuyenSangManHinh2(View v) {
        //1. Tao Intent
        Intent iMH2 = new Intent(MainActivity.this,
                                               ProfileActivity.class);
        //2. Goi du lieu
        iMH2.putExtra("ten","Mai Cuong Th0");

        //3. Chuyen man hinh
        startActivity(iMH2);
    }
}