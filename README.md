# Android_Restaurant_app
## This is a project made in java and xml , with the purpose of showing the menu of a restaurant 


### Here is the Xml of the design 

![image](https://github.com/juliaigz/Android_Restaurant_app/assets/40221707/3e819b7f-f864-470c-8bd9-ed6907665ab2)

![image](https://github.com/juliaigz/Android_Restaurant_app/assets/40221707/9192e64e-4edd-4ffd-a771-b2127d4cd206)

![image](https://github.com/juliaigz/Android_Restaurant_app/assets/40221707/2ae46c10-e8d6-4708-ace4-6692d3ebb19d)

### Here is the Java code of the 3 screens 

![image](https://github.com/juliaigz/Android_Restaurant_app/assets/40221707/0350799d-720c-4e15-9af8-66a84af92799)

![image](https://github.com/juliaigz/Android_Restaurant_app/assets/40221707/2b85a4e2-a4d5-4351-a12d-03c231e8fccb)

![image](https://github.com/juliaigz/Android_Restaurant_app/assets/40221707/193c158f-b815-4c6a-9c33-7aab8c05e8ae)


Main Activity


´´´Bash

public class MainActivity extends AppCompatActivity {

    private Button button1;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        button1 =binding.button1;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
´´´
Main activity 2 

´´´Bash
public class MainActivity2 extends AppCompatActivity {
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        imageButton1 = binding.imageButton1;
        imageButton2 = binding.imageButton2;
        imageButton3 = binding.imageButton3;
        //Intent intent2 = getIntent(); esto es solo para recibir datos
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNuevo = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intentNuevo);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNuevo = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intentNuevo);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNuevo = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intentNuevo);
            }
        });
    }
}
´´´

Main Activity 3

´´´Bash
public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main3);

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
´´´
