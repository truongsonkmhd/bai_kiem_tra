package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.baikiemtra.share_prefs.PrefsHelper;

import org.json.JSONArray;
import org.json.JSONObject;

public class AddContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        EditText etName = findViewById(R.id.etName);
        EditText etPhone = findViewById(R.id.etPhone);
        EditText etEmail = findViewById(R.id.etEmail);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());

        btnSave.setOnClickListener(v -> {
            try {
                String name = etName.getText().toString().trim();
                String phone = etPhone.getText().toString().trim();
                String email = etEmail.getText().toString().trim();

                if (name.isEmpty() || phone.isEmpty()) {
                    etName.setError("Vui lòng nhập đầy đủ");
                    return;
                }

                JSONArray arr = new JSONArray(PrefsHelper.getContacts(this));
                JSONObject obj = new JSONObject();
                obj.put("name", name);
                obj.put("phone", phone);
                obj.put("email", email);
                arr.put(obj);

                PrefsHelper.saveContacts(this, arr.toString());
                finish();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
