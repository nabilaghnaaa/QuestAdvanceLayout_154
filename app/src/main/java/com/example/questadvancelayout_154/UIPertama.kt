package com.example.questadvancelayout_154

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.* // untuk elemen layout seperti Column, Row, Box, Spacer, dll
import androidx.compose.material3.* // untuk komponen Material Design 3 seperti Card dan Text
import androidx.compose.runtime.Composable // agar bisa bikin fungsi composable
import androidx.compose.ui.Alignment // untuk mengatur alignment (posisi)
import androidx.compose.ui.Modifier // untuk mengatur tampilan/posisi ukuran
import androidx.compose.ui.graphics.Color // untuk warna
import androidx.compose.ui.res.painterResource // untuk ambil gambar dari drawable
import androidx.compose.ui.res.stringResource // untuk ambil teks dari strings.xml
import androidx.compose.ui.text.font.FontFamily // untuk jenis font
import androidx.compose.ui.text.font.FontWeight // untuk ketebalan font
import androidx.compose.ui.unit.dp // untuk ukuran dalam dp
import androidx.compose.ui.unit.sp // untuk ukuran teks dalam sp

@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) { // fungsi utama tampilan
    Column( // menata elemen secara vertikal
        modifier = modifier
            .padding(top = 100.dp) // jarak dari atas 100dp
            .fillMaxSize(), // isi seluruh ukuran layar
        horizontalAlignment = Alignment.CenterHorizontally // semua elemen di tengah horizontal
    ) {
        Text(
            text = stringResource(id = R.string.prodi), // ambil teks dari strings.xml (prodi)
            fontSize = 35.sp, // ukuran teks 35sp
            fontWeight = FontWeight.Bold // teks tebal
        )
        Text(
            text = stringResource(id = R.string.univ), // ambil teks universitas
            fontSize = 22.sp // ukuran teks 22sp
        )

        Spacer(modifier = Modifier.height(25.dp)) // jarak vertikal 25dp

        Card(
            modifier = Modifier
                .fillMaxWidth() // lebar penuh
                .padding(12.dp), // jarak dari tepi 12dp
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray // warna background kartu abu tua
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically, // isi sejajar secara vertikal di tengah
                modifier = Modifier.padding(16.dp) // jarak isi kartu dari tepi dalam 16dp
            ) {
                val gambar = painterResource(id = R.drawable.umy) // ambil gambar dari drawable
                Image(
                    painter = gambar, // tampilkan gambar UMY
                    contentDescription = null, // deskripsi bisa null
                    modifier = Modifier
                        .size(100.dp) // ukuran gambar 100dp
                        .padding(all = 5.dp) // jarak sekitar gambar 5dp
                )
                Spacer(modifier = Modifier.width(38.dp)) // jarak antara gambar dan teks
                Column { // teks nama & alamat ditata vertikal
                    Text(
                        text = stringResource(id = R.string.nama), // ambil teks nama dari strings.xml
                        fontSize = 30.sp, // ukuran teks 30sp
                        fontFamily = FontFamily.Cursive, // gaya tulisan miring/latin
                        color = Color.White, // warna putih
                        modifier = Modifier.padding(top = 15.dp) // jarak atas 15dp
                    )
                    Text(
                        text = stringResource(id = R.string.alamat), // ambil teks alamat dari strings.xml
                        fontSize = 20.sp, // ukuran teks 20sp
                        color = Color.Yellow, // warna kuning
                        modifier = Modifier.padding(top = 10.dp) // jarak atas 10dp
                    )
                }
            }
        }

        Box( // wadah fleksibel untuk posisi bebas (seperti absolute layout)
            modifier = Modifier.fillMaxSize() // isi seluruh layar
        ) {
            Text(
                text = stringResource(id = R.string.copy), // teks copyright di bawah
                modifier = Modifier
                    .align(Alignment.BottomCenter) // posisikan di bawah tengah
                    .padding(bottom = 50.dp) // jarak dari bawah 50dp
            )
        }
    }
}
