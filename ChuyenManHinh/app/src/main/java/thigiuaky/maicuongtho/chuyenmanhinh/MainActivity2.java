package thigiuaky.maicuongtho.chuyenmanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    //onClick="ChuyenVeManHinhChinh"
    public void ChuyenVeManHinhChinh (View v) {
        //1. Lay intent ve
        Intent iNhanDuoc = getIntent();

        //2. Boc du lieu
        String data = iNhanDuoc.getStringExtra("ten");

        //3: hien lem
        Toast.makeText(getBaseContext(), data,Toast.LENGTH_LONG ).show();

        //4. Chuyen ve man hinh chinh
        Intent iManHinhChinh = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(iManHinhChinh);
    }
}