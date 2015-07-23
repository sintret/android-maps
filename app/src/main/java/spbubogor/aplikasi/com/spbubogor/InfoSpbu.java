package spbubogor.aplikasi.com.spbubogor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by andy on 7/14/2015.
 */
public class InfoSpbu extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infospbu);


        // Code pemrograman untuk membuat ListView Sederhana
		/*
		String[] arrName = {"Samsung","Sony","Apple","LG","Motorola",
		"HTC","Acer","Lenovo","Oppo","Nokia","BlackBerry","Huawei",
		"ZTE","Meizu","HP","Asus","Panasonic"};

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		android.R.layout.simple_list_item_1, arrName);

		ListView listView = (ListView) findViewById(R.id.id_list);
		listView.setAdapter(adapter);
		*/


        ArrayList<Phone> list = new ArrayList<Phone>();
        list.add(new Phone("1.SPBU 34.161.02", "Jl. Raya Pajajaran No. 127"));
        list.add(new Phone("2.SPBU 34.161.09", "Jl. Kedung Halang"));
        list.add(new Phone("3.SPBU 34.161.12", "Jl. Raya Sindangbarang"));
        list.add(new Phone("4.SPBU 34.161.13", "Jl. Brigjen Saptaji Hadi Prawira"));
        list.add(new Phone("5.SPBU 34.161.15", "Jl. Veteran"));
        list.add(new Phone("6.SPBU 34.161.16", "Jl. KH. Soleh Iskandar"));
        list.add(new Phone("7.SPBU 34.161.17", "Jl. RE Abdullah No. 16"));
        list.add(new Phone("8.SPBU 34.161.18", "Jl. Tentara Pelajar"));
        list.add(new Phone("9.SPBU 34.161.20", "Jl. KH Sholeh iskandar"));
        list.add(new Phone("10.SPBU 34.163.04", "Jl. Raya Parakan Benda"));
        list.add(new Phone("11.SPBU 34.163.11", "Jl. Raya Parung Jabon"));
        list.add(new Phone("12.SPBU 34.163.12", "Jl. Parung Panjang"));
        list.add(new Phone("13.SPBU 34.163.13", "Jl. Gunung Sindur"));
        list.add(new Phone("14.SPBU 34.166.05", "Jl. Dermaga"));
        list.add(new Phone("15.SPBU 34.167.01", "Jl. Raya Cipayung Puncak"));
        list.add(new Phone("16.SPBU 34.167.04", "Jl. Tol Jagorawi-Bogor"));
        list.add(new Phone("17.SPBU 34.167.06", "Jl. Raya Cibogo Puncak"));
        list.add(new Phone("18.SPBU 34.167.07", "Jl. Alternatif Kandang Roda - Sentul"));
        list.add(new Phone("19.SPBU 34.167.10", "Jl. Raya Puncak"));
        list.add(new Phone("20.SPBU 34.167.12", "Jl. Alternatif Sentul Cijujung"));
        list.add(new Phone("21.SPBU 34.167.13", "Jl. HM Sukma"));
        list.add(new Phone("22.SPBU 34.167.14", "Jl. Taman Safari Cisarua"));
        list.add(new Phone("23.SPBU 34.167.15", "Jl. Pemda Kedung Halang"));
        list.add(new Phone("24.SPBU 34.168.03", "Jl. Mayor Oking "));
        list.add(new Phone("25.SPBU 34.168.05", "Jl. Raya Cilengsi Jonggol"));
        list.add(new Phone("26.SPBU 34.168.15", "Jl. Raya Cileungsi"));
        list.add(new Phone("27.SPBU 34.168.17", "Jl. Raya Jonggol Km 2 Cileungsi Kidul"));
        list.add(new Phone("28.SPBU 34.168.19", "Jl. Raya Narogong Km 19.5"));
        list.add(new Phone("29.SPBU 34.168.20", "Jl. Raya Cileungsi-Jonggol Ds.Cipeucang"));
        list.add(new Phone("30.SPBU 34.169.02", "Jl. Raya Bogor km40"));
        list.add(new Phone("31.SPBU 34.169.04", "Jl. Mayor Oking Citeurep"));
        list.add(new Phone("32.SPBU 34.169.11", "Jl. Pemda Keradenan Cibinong"));
        list.add(new Phone("33.SPBU 34.169.12", "Jl. Raya Cisalak ds.Tugu Cimanggis"));
        list.add(new Phone("34.SPBU 34.169.26 ", "Jl. Dedi Kusmayadi Cibinong"));
        list.add(new Phone("35.SPBU 34.169.27", "Jl. Letda Nasir"));
        list.add(new Phone("36.SPBU 34.169.29", "  Jl. Gunung Putri "));
        list.add(new Phone("37.SPBU 34.169.31 ", " Jl. Mayor Oking Km. 2 "));


        ListAdapter adapter = new ListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.id_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                Toast.makeText(InfoSpbu.this, "DAFTAR SPBU BOGOR",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
