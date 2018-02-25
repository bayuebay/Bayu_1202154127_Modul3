package com.example.bay.bayu_1202154127_modul3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bayu A. Irsan
 */

//Class Adapter ini Digunakan Untuk Mengatur Bagaimana Data akan Ditampilkan
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    //digunakan untuk menerima dan menyimpan list item
    private ArrayList<String> arrayListTitle, arrayListDesc;
    private ArrayList<Integer> arrayListGambar;

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerAdapter(ArrayList<String> arrayListTitle, ArrayList<String> arrayListDesc, ArrayList<Integer> arrayListGambar){
        this.arrayListTitle = arrayListTitle;
        this.arrayListDesc = arrayListDesc;
        this.arrayListGambar = arrayListGambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Title, Desc;
        private ImageView Gambar;
        private LinearLayout itemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Title = itemView.findViewById(R.id.title);
            Desc = itemView.findViewById(R.id.desc);
            Gambar = itemView.findViewById(R.id.gambar);
            itemList = itemView.findViewById(R.id.list_item);

        }

    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_product, parent,false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(final RecyclerAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String title = arrayListTitle.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String desc = arrayListDesc.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer gambar = arrayListGambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.Title.setText(title);// Mengambil text sesuai posisi yang telah ditentukan
        holder.Desc.setText(desc); // Mengambil text sesuai posisi yang telah ditentukan
        holder.Gambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan

        //Membuat Aksi Saat List Ditekan
        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), detailActivity.class);
                String descs = "Air yang tidak bersih tidak hanya dapat mempengaruhi kesehatan, namun juga keselamatan dan kualitas hidup anak-anak. UNICEF memperkirakan sebanyak 1.400 anak usia di bawah lima tahun meninggal setiap hari karena penyakit diare yang erat kaitannya dengan kurangnya air bersih serta sanitasi dan kebersihan yang memadai. Bahkan setiap tahunnya, Indonesia menderita kerugian sebesar USD 6,3 miliar dikarenakan sanitasi buruk. Dengan meningkatkan sanitasi, Indonesia berpotensi memberikan kontribusi sebesar USD 4,5 miliar bagi pertumbuhan ekonomi.\n" + "\n"+
                        "Lalu, apakah air jernih yang sehari-hari kita lihat, minum, dan gunakan sudah bener-benar sehat dan layak? Dari mana kita tahu air tersebut memang bersih. Mengutip Keputusan Menteri Kesehatan Republik Indonesia Nomor 1405/menkes/sk/xi/2002 tentang Persyaratan Kesehatan Lingkungan Kerja Perkantoran dan Industri, air bersih adalah air yang dipergunakan untuk keperluan sehari-hari dan kualitasnya memenuhi persyaratan kesehatan air bersih sesuai dengan peraturan perundang-undangan yang berlaku dan dapat diminum apabila dimasak.\n";
                switch (position){
                    case 0:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListTitle.size();
    }
}
