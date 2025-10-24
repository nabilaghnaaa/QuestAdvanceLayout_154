package com.example.questadvancelayout_154

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AktivitasKedua(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Foto profil bulat
        Image(
            painter = painterResource(id = R.drawable.profil),
            contentDescription = "Foto Profil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color.Gray, CircleShape)
        )

        Spacer(modifier = Modifier.height(15.dp))

        // Ikon sosial media (Facebook, Instagram, LinkedIn)
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_facebook),
                contentDescription = "Facebook",
                modifier = Modifier.size(32.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_instagram),
                contentDescription = "Instagram",
                modifier = Modifier.size(32.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_linkedin),
                contentDescription = "LinkedIn",
                modifier = Modifier.size(32.dp)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        // Nama
        Text(
            text = stringResource(id = R.string.nama_profil),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        // Username
        Text(
            text = stringResource(id = R.string.username_profil),
            fontSize = 14.sp,
            color = Color.Gray
        )

        // Deskripsi pekerjaan
        Text(
            text = stringResource(id = R.string.job_profil),
            fontSize = 16.sp,
            color = Color.White,
            modifier = Modifier.padding(top = 8.dp, bottom = 25.dp)
        )

        // === CARD MENU LANGSUNG DALAM SATU FUNGSI ===
        val cardItems = listOf(
            Pair(R.drawable.ic_privacy, stringResource(id = R.string.menu_privacy)),
            Pair(R.drawable.ic_history, stringResource(id = R.string.menu_transaksi)),
            Pair(R.drawable.ic_settings, stringResource(id = R.string.menu_pengaturan))
        )

        for (item in cardItems) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp, vertical = 8.dp)
                    .clickable { },
                colors = CardDefaults.cardColors(containerColor = Color(0xFF2E2E2E)),
                shape = RoundedCornerShape(15.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = item.first),
                            contentDescription = item.second,
                            tint = Color.White,
                            modifier = Modifier.size(22.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = item.second,
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }
                    Text(
                        text = "›",
                        fontSize = 22.sp,
                        color = Color.Gray
                    )
                }
            }
        }

        // Spacer untuk mendorong teks copyright ke bawah
        Spacer(modifier = Modifier.weight(1f))

// Copyright bawah
        Text(
            text = stringResource(id = R.string.copy_profil),
            fontSize = 12.sp,
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}