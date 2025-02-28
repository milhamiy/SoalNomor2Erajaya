# 🌟 Soal Nomor 2 Erajaya

## 📌 Soalnya Sebagai berikut : 
2.	Buatlah automation script untuk Web (Katalon / tools lain) berdasarkan test case berikut. Tuliskan githubnya.
Url demo apps : https://katalon-demo-cura.herokuapp.com/


---

## 🚀 Features
✅ **Test Case 1.1 - Login Dengan Invalid Data Username & Password**  : 
1. Pengecekkan apakah user bisa input data pada component Text Field "Username" & "Password"
2. Pengecekkan Current URL apakah Tetap Pada Halaman Login Atau Tidak **Seharusnya karna menginput Username & Password Yang Salah Akan Tetap Pada Halaman Login**
3. Pengecekkan Apakah Component Label Error Message Muncul Atau Tidak, Apabila Muncul maka akan ada pengecekkan lagi untuk wording-nya Sesuai Atau tidak dengan wording **Login failed! Please ensure the username and password are valid.**
✅ **UI & UX Verification**  
✅ **Data-Driven Testing**  
✅ **Error Handling & Logging**  
✅ **Cross-Browser Testing**  
✅ **Test Execution Report**  

---

## 📂 Project Structure
```
📦 Katalon-TestSuite
 ┣ 📂 Object Repository   # Kumpulan elemen UI yang diuji
 ┣ 📂 Test Cases          # Skrip pengujian individu
 ┣ 📂 Test Suites        # Pengelompokan test case
 ┣ 📂 Data Files         # Dataset untuk pengujian
 ┣ 📂 Reports            # Hasil eksekusi testing
 ┗ 📄 README.md          # Dokumentasi proyek
```

---

## 🛠️ Prerequisites
Sebelum menjalankan project ini, pastikan:
- 🔹 **Katalon Studio** telah terinstall
- 🔹 **Google Chrome / Mozilla Firefox** (untuk eksekusi browser)
- 🔹 **JDK 8+** (untuk kompatibilitas Katalon)

---

## ▶️ How to Run Tests
💡 **Jalankan Test Suite:**
1. **Buka Katalon Studio**
2. **Pilih Test Suite** yang ingin dieksekusi
3. **Klik "Run"** ▶️ (Pilih browser sesuai kebutuhan)

📌 **Menjalankan dengan CLI:**
```bash
katalonc -noSplash -runMode=console -projectPath="path/to/project" -testSuitePath="Test Suites/Suite_Name" -browserType="Chrome"
```

---

## 📜 Adding Close Browser in Test Suite
Untuk memastikan browser tertutup setelah semua test case selesai, tambahkan kode berikut di **Test Listener**:

```groovy
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class CloseBrowserListener {
    @AfterTestSuite
    def closeBrowser() {
        WebUI.closeBrowser()
    }
}
```

Atau, tambahkan di **Test Case terakhir**:
```groovy
WebUI.closeBrowser()
```

---

## 📊 Test Report & Logs
📌 Setelah eksekusi, laporan dapat ditemukan di folder `Reports/` dalam format **HTML**, **JUnit**, atau **CSV**.

---

## 💡 Troubleshooting
❌ **Error: Web element not found**  
✔️ Periksa kembali `Object Repository` apakah elemen masih valid

❌ **Browser tidak terbuka**  
✔️ Pastikan `WebUI.openBrowser()` dijalankan sebelum tes

❌ **Test Case gagal karena timeout**  
✔️ Tambahkan `WebUI.waitForElementVisible()` sebelum aksi

---

## 🤝 Contributing
🔥 Jika ingin berkontribusi:
1. **Fork** repo ini 🍴
2. **Buat branch baru** (`feature-namaFitur`)
3. **Commit perubahan** ✅
4. **Buat Pull Request** 🚀

---

## 📝 License
📄 **MIT License** - Bebas digunakan dengan menyertakan atribusi.

---

## 🙌 Credits
✨ Project ini dikembangkan oleh **Muhammad Ilham Idris Junus** 💡

