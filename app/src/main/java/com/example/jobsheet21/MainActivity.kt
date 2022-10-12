package com.example.jobsheet21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listKelas = arrayOf(
        "DINA MUSTIKA",
        "DWI RANI SYARIFAH",
        "FIFIT SHOLIKHATUL MUFALAH",
        "FIKA ISMATUL HAWA",
        "FIKI ZULKARNAIN",
        "HEYDARISTO ZHAHIR RAZAQ",
        "IKHA NOR ROCHAYATIN",
        "IMA AZKA ROSADAH",
        "KHAMILA NUR LUTFI AZZAHRA",
        "LAILATUL RISA ISTIFADHOH",
        "LUK LUUL LATIFAH"
    )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listKelas.indices) {
            list.add(Kelas(listKelas[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}