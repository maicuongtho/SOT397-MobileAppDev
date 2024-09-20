package vn.thomc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SayHello(View v){
        // Tìm điều khiển
        EditText soThuNhat   =  findViewById(R.id.edtNum1);
        EditText soThuHai   =  findViewById(R.id.edtNum2);
        // Lấy dữ liệu. getter
        String s1= soThuNhat.getText().toString();
        String s2= soThuHai.getText().toString();
        // Chuyển kiểu
        double num1 = Double.parseDouble(s1);
        double num2 = Double.parseDouble(s2);
        // Tính toán
        double tong = num1 + num2;

        // Chuẩn bị để xuất
        String chuoiXuat = "Tổng là : " + String.valueOf(tong);

       Toast.makeText( this,
                        chuoiXuat,
                        Toast.LENGTH_SHORT)
                       .show();

    }
}