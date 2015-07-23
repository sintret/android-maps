package spbubogor.aplikasi.com.spbubogor;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.support.v4.app.Fragment;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class CariLokasi extends FragmentActivity {

    private GoogleMap map;

    private LatLng spbu1 = new LatLng(-6.608776, 106.810298);
    private LatLng spbu2 = new LatLng(-6.531724, 106.807805);
    private LatLng spbu3 = new LatLng(-6.562726, 106.734953);
    private LatLng spbu4 = new LatLng(-6.570090, 106.767315);
    private LatLng spbu5 = new LatLng(-6.595147, 106.785913);
    private LatLng spbu6 = new LatLng(-6.558554, 106.786992);
    private LatLng spbu7 = new LatLng(-6.595857, 106.778151);
    private LatLng spbu8 = new LatLng(-6.580326, 106.788048);
    private LatLng spbu9 = new LatLng(-6.558277, 106.782963);
    private LatLng spbu10 = new LatLng(-6.527267, 106.764364);
    private LatLng spbu11 = new LatLng(-6.439619, 106.733028);
    private LatLng spbu12 = new LatLng(-6.329688, 106.576675);
    private LatLng spbu13 = new LatLng(-6.383948, 106.680352);

    private LatLng spbu15 = new LatLng(-6.566834, 106.737166);
    private LatLng spbu16 = new LatLng(-6.648587, 106.866908);
    private LatLng spbu17 = new LatLng(-6.570715, 106.840574);
    private LatLng spbu18 = new LatLng(-6.651909, 106.882514);
    private LatLng spbu19 = new LatLng(-6.528684, 106.849390);
    private LatLng spbu20 = new LatLng(-6.655006, 106.860228);
    private LatLng spbu21 = new LatLng(-6.522992, 106.842277);
    private LatLng spbu22 = new LatLng(-6.755382, 106.799174);
    private LatLng spbu23 = new LatLng(-6.717190, 106.951201);
    private LatLng spbu24 = new LatLng(-6.553329, 106.807772);
    private LatLng spbu25 = new LatLng(-6.477948, 106.882811);
    private LatLng spbu26 = new LatLng(-6.405807, 106.965145);
    private LatLng spbu27 = new LatLng(-6.404677, 106.965574);
    private LatLng spbu28 = new LatLng(-6.460389, 107.064370);
    private LatLng spbu29 = new LatLng(-6.373950, 106.970663);
    private LatLng spbu30 = new LatLng(-6.407224, 106.972323);
    private LatLng spbu31 = new LatLng(-6.472343, 106.847778);
    private LatLng spbu32 = new LatLng(-6.472960, 106.885297);
    private LatLng spbu33 = new LatLng(-6.509405, 106.806304);
    private LatLng spbu34 = new LatLng(-6.375927, 106.863762);
    private LatLng spbu35 = new LatLng(-6.471995, 106.821803);
    private LatLng spbu36 = new LatLng(-6.472157, 106.822016);
    private LatLng spbu37 = new LatLng(-6.452562, 106.904967);
    private LatLng spbu38 = new LatLng(-6.464973, 106.890845);
    private LatLng myhome1 = new LatLng(-6.485823, 106.754890);
    private LatLng kampus = new LatLng(-6.599563, 106.811806);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.carilokasi);

        SupportMapFragment mapFrag = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        map = mapFrag.getMap();
        map.setMyLocationEnabled(true);

        map.addMarker(new MarkerOptions()
                .position(spbu1)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.161.02").snippet("Jl. Raya Pajajaran No. 127"));

        map.addMarker(new MarkerOptions()
                .position(spbu2)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.161.09").snippet("JL. Kedung Halang, Bogor"));

        map.addMarker(new MarkerOptions()
                .position(spbu3)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.161.12").snippet("Jl. Raya Sindangbarang Bubulak"));

        map.addMarker(new MarkerOptions()
                .position(spbu4)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.161.13 ").snippet("Jl. Brigjen Saptaji Hadi Prawira "));
        map.addMarker(new MarkerOptions()
                .position(spbu5)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.161.15 ").snippet("Jl. Veteran "));
        map.addMarker(new MarkerOptions()
                .position(spbu6)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.161.16  ").snippet("Jl. KH. Soleh Iskandar"));
        map.addMarker(new MarkerOptions()
                .position(spbu7)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.161.17 ").snippet("Jl. RE Abdullah No. 16 "));
        map.addMarker(new MarkerOptions()
                .position(spbu8)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.161.18 ").snippet("Jl. Tentara Pelajar "));
        map.addMarker(new MarkerOptions()
                .position(spbu9)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.161.20 ").snippet("Jl. KH Sholeh iskandar "));
        map.addMarker(new MarkerOptions()
                .position(spbu10)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.163.04 ").snippet("Jl. Raya Parakan Benda "));
        map.addMarker(new MarkerOptions()
                .position(spbu11)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.163.11 ").snippet(" Jl. Raya Parung Jabon"));
        map.addMarker(new MarkerOptions()
                .position(spbu12)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.163.12 ").snippet("Jl. Parung Panjang"));
        map.addMarker(new MarkerOptions()
                .position(spbu13)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.163.13").snippet("Jl. Gunung Sindur"));

        map.addMarker(new MarkerOptions()
                .position(spbu15)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.166.05").snippet("Jl. Dermaga "));
        map.addMarker(new MarkerOptions()
                .position(spbu16)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.167.01 ").snippet("Jl. Raya Cipayung Puncak "));

        map.addMarker(new MarkerOptions()
                .position(spbu17)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.167.04 ").snippet("Jl. Tol Jagorawi-Bogor "));

        map.addMarker(new MarkerOptions()
                .position(spbu18)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.167.06 ").snippet("Jl. Raya Cibogo Puncak "));

        map.addMarker(new MarkerOptions()
                .position(spbu19)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.167.07").snippet("Jl. Alternatif Kandang Roda - Sentul "));

        map.addMarker(new MarkerOptions()
                .position(spbu20)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.167.10 ").snippet("Jl. Raya Puncak "));

        map.addMarker(new MarkerOptions()
                .position(spbu21)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.167.12 ").snippet("Jl. Alternatif Sentul Cijujung "));

        map.addMarker(new MarkerOptions()
                .position(spbu22)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.167.13 ").snippet("Jl. HM Sukma "));

        map.addMarker(new MarkerOptions()
                .position(spbu23)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.167.14 ").snippet("Jl. Taman Safari Cisarua "));

        map.addMarker(new MarkerOptions()
                .position(spbu24)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.167.15").snippet("Jl. Pemda Kedung Halang "));

        map.addMarker(new MarkerOptions()
                .position(spbu25)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title(" SPBU 34.168.03").snippet("Jl. Mayor Oking "));

        map.addMarker(new MarkerOptions()
                .position(spbu26)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title(" SPBU 34.168.05").snippet("Jl. Raya Cilengsi Jonggol "));

        map.addMarker(new MarkerOptions()
                .position(spbu27)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.168.15 ").snippet("Jl. Raya Cileungsi "));

        map.addMarker(new MarkerOptions()
                .position(spbu28)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.168.17").snippet("Jl. Raya Jonggol Km 2 Cileungsi Kidul "));

        map.addMarker(new MarkerOptions()
                .position(spbu29)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title(" SPBU 34.168.19").snippet(" Jl. Raya Narogong Km 19.5"));

        map.addMarker(new MarkerOptions()
                .position(spbu30)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.168.20  ").snippet("Jl. Raya Cileungsi-Jonggol Ds.Cipeucang  "));
        map.addMarker(new MarkerOptions()
                .position(spbu31)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.169.02").snippet("Jl. Raya Bogor km40"));
        map.addMarker(new MarkerOptions()
                .position(spbu32)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.169.04 ").snippet(" Jl. Mayor Oking Citeurep"));
        map.addMarker(new MarkerOptions()
                .position(spbu33)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.169.11 ").snippet("Jl. Pemda Keradenan Cibinong "));
        map.addMarker(new MarkerOptions()
                .position(spbu34)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.169.12 ").snippet("Jl. Raya Cisalak ds.Tugu Cimanggis "));

        map.addMarker(new MarkerOptions()
                .position(spbu35)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.169.26 ").snippet(" Jl. Dedi Kusmayadi Cibinong"));
        map.addMarker(new MarkerOptions()
                .position(spbu36)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.169.27 ").snippet("Jl. Letda Nasir "));
        map.addMarker(new MarkerOptions()
                .position(spbu37)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.169.29 ").snippet("Jl. Gunung Putri "));
        map.addMarker(new MarkerOptions()
                .position(spbu38)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                .title("SPBU 34.169.31").snippet("Jl. Mayor Oking Km. 2 "));
        map.addMarker(new MarkerOptions()
                .position(myhome1)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.myhome))
                .title("Perumahan Bumi Insani Blok B7 NO 24").snippet("Jalan Perum Bumi Insani,Tajurhalang,Bogor"));
        map.addMarker(new MarkerOptions()
                .position(kampus)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.kampus))
                .title("Universitas Pakuan").snippet("Jl. Pakuan PB 452,Jawa Barat 16143 Indonesia"));


    }
}
