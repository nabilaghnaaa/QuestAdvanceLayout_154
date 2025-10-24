package com.example.questadvancelayout_154 // Nama package tempat file Kotlin ini berada

// ===== IMPORT LIBRARY =====
import androidx.compose.foundation.Image // Untuk menampilkan gambar (seperti foto profil, ikon, dll)
import androidx.compose.foundation.background // Untuk memberi warna latar belakang
import androidx.compose.foundation.clickable // Agar komponen bisa diklik
import androidx.compose.foundation.layout.* // Untuk mengatur tata letak (Row, Column, Spacer, Box, dll)
import androidx.compose.foundation.shape.CircleShape // Untuk membuat bentuk lingkaran (contoh: foto profil)
import androidx.compose.foundation.shape.RoundedCornerShape // Untuk membuat sudut membulat (contoh: card)
import androidx.compose.material3.* // Untuk komponen Material Design versi 3 (Card, Text, Icon, dsb)
import androidx.compose.runtime.Composable // Untuk menandai fungsi sebagai composable (bagian UI)
import androidx.compose.ui.Alignment // Untuk mengatur posisi/alignment elemen
import androidx.compose.ui.Modifier // Untuk memodifikasi tampilan (ukuran, padding, background, dll)
import androidx.compose.ui.draw.clip // Untuk memotong bentuk elemen (misal jadi lingkaran)
import androidx.compose.ui.graphics.Color // Untuk menentukan warna
import androidx.compose.ui.layout.ContentScale // Untuk mengatur cara gambar menyesuaikan ukuran
import androidx.compose.ui.res.painterResource // Untuk memanggil gambar dari folder drawable
import androidx.compose.ui.res.stringResource // Untuk memanggil teks dari file string.xml
import androidx.compose.ui.text.font.FontWeight // Untuk mengatur ketebalan teks
import androidx.compose.ui.unit.dp // Untuk menentukan ukuran dalam satuan dp (density pixel)
import androidx.compose.ui.unit.sp // Untuk menentukan ukuran teks dalam satuan sp (scale pixel)

// ===== FUNGSI TAMPILAN PROFIL =====
@Composable // Menandakan bahwa fungsi ini adalah bagian dari UI yang bisa ditampilkan
fun AktivitasKedua(modifier: Modifier = Modifier) { // Fungsi composable bernama AktivitasKedua dengan parameter opsional modifier
    Column( // Layout vertikal: menumpuk elemen dari atas ke bawah
        modifier = modifier // Modifier bawaan agar bisa ditambah properti lain
            .fillMaxSize() // Mengisi seluruh ruang layar (lebar dan tinggi)
            .background(Color.Black) // Memberikan latar belakang warna hitam
            .padding(top = 60.dp), // Memberikan jarak dari tepi atas layar sebesar 60dp
        horizontalAlignment = Alignment.CenterHorizontally // Semua elemen di dalam column rata tengah secara horizontal
    ) {
        // ===== FOTO PROFIL =====
        Image( // Menampilkan gambar profil
            painter = painterResource(id = R.drawable.profil), // Mengambil gambar dari resource drawable dengan nama "profil"
            contentDescription = "Foto Profil", // Teks deskripsi alternatif untuk aksesibilitas
            contentScale = ContentScale.Crop, // Gambar dipotong agar pas mengisi lingkaran
            modifier = Modifier // Mulai memodifikasi bentuk gambar
                .size(120.dp) // Ukuran tinggi dan lebar gambar = 120dp
                .clip(CircleShape) // Memotong gambar menjadi bentuk lingkaran
                .background(Color.Gray, CircleShape) // Memberikan warna abu-abu di belakang gambar profil
        )

        Spacer(modifier = Modifier.height(15.dp)) // Menambah jarak vertikal 15dp di bawah foto profil

        // ===== IKON SOSIAL MEDIA =====
        Row( // Layout horizontal: menampilkan elemen sejajar ke kanan
            horizontalArrangement = Arrangement.spacedBy(16.dp), // Jarak antar ikon sebesar 16dp
            verticalAlignment = Alignment.CenterVertically // Semua ikon sejajar tengah secara vertikal
        ) {
            Image( // Ikon Facebook
                painter = painterResource(id = R.drawable.ic_facebook), // Mengambil ikon dari drawable
                contentDescription = "Facebook", // Deskripsi ikon
                modifier = Modifier.size(32.dp) // Ukuran ikon 32dp
            )
            Image( // Ikon Instagram
                painter = painterResource(id = R.drawable.ic_instagram), // Mengambil ikon Instagram
                contentDescription = "Instagram", // Deskripsi ikon
                modifier = Modifier.size(32.dp) // Ukuran ikon 32dp
            )
            Image( // Ikon LinkedIn
                painter = painterResource(id = R.drawable.ic_linkedin), // Mengambil ikon LinkedIn
                contentDescription = "LinkedIn", // Deskripsi ikon
                modifier = Modifier.size(32.dp) // Ukuran ikon 32dp
            )
        }

        Spacer(modifier = Modifier.height(15.dp)) // Memberi jarak vertikal setelah baris ikon

        // ===== NAMA PROFIL =====
        Text( // Menampilkan teks nama profil
            text = stringResource(id = R.string.nama_profil), // Mengambil teks dari string.xml (resource)
            fontSize = 24.sp, // Ukuran teks besar 24sp
            fontWeight = FontWeight.Bold, // Membuat teks tebal
            color = Color.White // Warna teks putih
        )

        // ===== USERNAME =====
        Text( // Menampilkan username pengguna
            text = stringResource(id = R.string.username_profil), // Teks dari string.xml
            fontSize = 14.sp, // Ukuran kecil 14sp
            color = Color.Gray // Warna abu-abu muda
        )

        // ===== DESKRIPSI PEKERJAAN =====
        Text( // Menampilkan deskripsi pekerjaan pengguna
            text = stringResource(id = R.string.job_profil), // Mengambil teks dari string.xml
            fontSize = 16.sp, // Ukuran teks sedang 16sp
            color = Color.White, // Warna teks putih
            modifier = Modifier.padding(top = 8.dp, bottom = 25.dp) // Memberi jarak atas 8dp dan bawah 25dp
        )

        // ===== DAFTAR ITEM CARD MENU =====
        val cardItems = listOf( // List berisi pasangan ikon dan teks menu
            Pair(R.drawable.ic_privacy, stringResource(id = R.string.menu_privacy)), // Item pertama: ikon privacy
            Pair(R.drawable.ic_history, stringResource(id = R.string.menu_transaksi)), // Item kedua: ikon history transaksi
            Pair(R.drawable.ic_settings, stringResource(id = R.string.menu_pengaturan)) // Item ketiga: ikon pengaturan
        )

        // ===== PERULANGAN UNTUK MENAMPILKAN CARD =====
        for (item in cardItems) { // Loop untuk menampilkan setiap menu card
            Card( // Komponen card untuk menampilkan setiap menu
                modifier = Modifier // Modifier untuk atur ukuran dan klik
                    .fillMaxWidth() // Card memenuhi lebar layar
                    .padding(horizontal = 25.dp, vertical = 8.dp) // Jarak sisi kiri kanan 25dp dan atas bawah 8dp
                    .clickable { }, // Card bisa diklik (belum ada aksi di dalam kurung kurawal)
                colors = CardDefaults.cardColors(containerColor = Color(0xFF2E2E2E)), // Warna latar card abu gelap
                shape = RoundedCornerShape(15.dp) // Sudut card membulat 15dp
            ) {
                Row( // Layout horizontal untuk isi card (ikon, teks, panah)
                    modifier = Modifier
                        .padding(16.dp) // Memberikan padding dalam card 16dp
                        .fillMaxWidth(), // Lebar isi card menyesuaikan lebar card
                    verticalAlignment = Alignment.CenterVertically, // Elemen sejajar di tengah vertikal
                    horizontalArrangement = Arrangement.SpaceBetween // Jarak antara sisi kiri dan kanan diatur otomatis
                ) {
                    Row( // Bagian kiri card (ikon dan teks menu)
                        verticalAlignment = Alignment.CenterVertically // Sejajarkan ikon dan teks di tengah vertikal
                    ) {
                        Icon( // Menampilkan ikon di dalam card
                            painter = painterResource(id = item.first), // Mengambil ikon dari resource
                            contentDescription = item.second, // Deskripsi ikon
                            tint = Color.White, // Warna ikon putih
                            modifier = Modifier.size(22.dp) // Ukuran ikon 22dp
                        )
                        Spacer(modifier = Modifier.width(12.dp)) // Jarak horizontal antara ikon dan teks
                        Text( // Menampilkan teks nama menu
                            text = item.second, // Teks nama menu dari resource
                            fontSize = 18.sp, // Ukuran teks 18sp
                            color = Color.White // Warna teks putih
                        )
                    }
                    Text( // Panah kanan "›" di sisi kanan card
                        text = "›", // Karakter panah kanan
                        fontSize = 22.sp, // Ukuran besar 22sp
                        color = Color.Gray // Warna abu-abu
                    )
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f)) // Spacer fleksibel untuk mendorong teks terakhir ke bawah layar

        // ===== TEKS COPYRIGHT =====
        Text( // Menampilkan teks kecil di bawah layar
            text = stringResource(id = R.string.copy_profil), // Mengambil teks dari string.xml
            fontSize = 12.sp, // Ukuran teks kecil 12sp
            color = Color.Gray, // Warna abu-abu
            modifier = Modifier.padding(bottom = 16.dp) // Jarak bawah 16dp agar tidak terlalu menempel ke tepi layar
        )
    } // Penutup Column
} // Penutup fungsi AktivitasKedua
