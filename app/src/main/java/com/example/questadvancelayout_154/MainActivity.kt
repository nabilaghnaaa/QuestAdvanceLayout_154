package com.example.questadvancelayout_154 // Nama package tempat file MainActivity berada

// ===== IMPORT LIBRARY =====
import android.os.Bundle // Digunakan untuk menyimpan dan memulihkan data saat aktivitas dibuat
import androidx.activity.ComponentActivity // Kelas dasar untuk Activity yang menggunakan Jetpack Compose
import androidx.activity.compose.setContent // Fungsi untuk menampilkan UI Compose di layar
import androidx.activity.enableEdgeToEdge // Mengaktifkan tampilan penuh sampai ke area status bar dan navigation bar
import androidx.compose.foundation.layout.fillMaxSize // Modifier untuk membuat elemen mengisi seluruh layar
import androidx.compose.foundation.layout.padding // Modifier untuk menambahkan jarak (padding)
import androidx.compose.material3.Scaffold // Struktur dasar Material Design yang menyediakan layout standar
import androidx.compose.material3.Text // Komponen teks untuk menampilkan tulisan di Compose
import androidx.compose.runtime.Composable // Penanda bahwa fungsi menghasilkan UI
import androidx.compose.ui.Modifier // Digunakan untuk menambahkan properti visual pada elemen (ukuran, padding, dll)
import androidx.compose.ui.tooling.preview.Preview // Untuk menampilkan pratinjau di Android Studio
import com.example.questadvancelayout_154.ui.theme.QuestAdvanceLayout_154Theme // Mengimpor tema kustom aplikasi

// ===== KELAS UTAMA APLIKASI =====
class MainActivity : ComponentActivity() { // MainActivity adalah activity utama aplikasi
    override fun onCreate(savedInstanceState: Bundle?) { // Fungsi yang dipanggil saat activity pertama kali dibuat
        super.onCreate(savedInstanceState) // Memanggil fungsi bawaan superclass (ComponentActivity)
        enableEdgeToEdge() // Mengaktifkan mode edge-to-edge agar UI bisa tampil sampai ke tepi layar (status bar transparan)
        setContent { // Bagian untuk menampilkan tampilan berbasis Compose
            QuestAdvanceLayout_154Theme { // Menerapkan tema aplikasi dari ui.theme
                Scaffold( // Struktur layout utama Material Design (sudah ada slot topBar, bottomBar, content, dsb)
                    modifier = Modifier.fillMaxSize() // Membuat Scaffold mengisi seluruh ukuran layar
                ) { innerPadding -> // innerPadding berisi padding bawaan dari Scaffold
                    AktivitasKedua( // Memanggil composable AktivitasKedua yang berisi tampilan profil
                        modifier = Modifier.padding(innerPadding) // Memberikan padding agar konten tidak tertutup elemen sistem
                    )
                }
            }
        }
    }
}

// ===== FUNGSI COMPOSABLE SEDERHANA =====
@Composable // Menandakan fungsi ini adalah bagian dari UI Compose
fun Greeting(name: String, modifier: Modifier = Modifier) { // Fungsi sederhana untuk menampilkan teks sapaan
    Text( // Komponen teks
        text = "Hello $name!", // Menampilkan tulisan dengan nama yang dikirim ke parameter
        modifier = modifier // Modifier opsional untuk mengatur tampilan teks
    )
}

// ===== PREVIEW UNTUK ANDROID STUDIO =====
@Preview(showBackground = true) // Menampilkan pratinjau UI di Android Studio dengan latar belakang
@Composable // Menandakan fungsi ini adalah composable
fun GreetingPreview() { // Fungsi preview untuk melihat tampilan Greeting() di editor
    QuestAdvanceLayout_154Theme { // Menggunakan tema aplikasi agar preview tampil konsisten
        Greeting("Android") // Menampilkan contoh teks "Hello Android!"
    }
}
