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

✅ **Test Case 1.2 Login Dengan Valid Data Username & Password**  
1. Pengecekkan apakah user bisa input data pada component Text Field "Username" & "Password"
2. Pengecekkan Login Berhasil atau tidak, apabila berhasil maka akan redirect ke link **https://katalon-demo-cura.herokuapp.com/#appointment**

✅ **Test Case 2.1 Buat Appointment tanpa mengisi mandatory field**
1. Akan Call Test Case 1.2
2. Pengecekkan seharusnya user akan tetap pada halaman appointment karna tidak menginput mandatory field
3. Pengecekkan Date Picker seharusnya muncul dikarenakan sebelumnya user tidak menginput mandatory field **visit Date**
4. Pengecekkan Error Message HTML5 "Please fill out this field." Seharusnya muncul

✅ **Test Case 2.2 Buat Appointment Dengan Mengisi Semua Field including Mandatory Field**
1. Pengecekkan untuk URL after book Appointment akan redirect ke #summary
2. Mengecheck wording label "Appointment Confirmation" muncul atau tidak dan wordingnya sesuai atau tidak
3. Mengecheck wording Label "Please be informed that your appointment has been booked as following:" muncul atau tidak dan wordingnya sesuai atau tidak
4. Mengecheck Component Divider muncul atau tidak
5. Mengecheck Wording Label "Facility" muncul atau tidak dan wordingnya sesuai atau tidak
6. Mengecheck Value dari field "Facility" muncul atau tidak dan wordingnya sesuai dengan data yang diinput sebelumnya atau tidak
7. Mengecheck Wording Label "Apply for hospital readmission" muncul atau tidak dan wordingnya sesuai atau tidak
8. Mengecheck Value dari field "Apply for hospital readmission" muncul atau tidak dan wordingnya sesuai dengan data yang diinput sebelumnya atau tidak, apabila sebelumnya di checklist "Apply for hospital readmission" maka otomatis value-nya adalah "Yes"
9. Mengecheck Wording Label "Healthcare Program" muncul atau tidak dan wordingnya sesuai atau tidak
10. Mengecheck Value dari field "Healthcare Program" muncul atau tidak dan wordingnya sesuai dengan data yang diinput sebelumnya atau tidak
11. Mengecheck Wording Label "Visit Date" muncul atau tidak dan wordingnya sesuai atau tidak
12. Mengecheck Value dari field "Visit Date" muncul atau tidak dan wordingnya sesuai dengan data date yang diinput sebelumnya atau tidak
13. Mengecheck Wording Label "Comment" muncul atau tidak dan wordingnya sesuai atau tidak
14. Mengecheck Value dari field "Comment" muncul atau tidak dan wordingnya sesuai dengan data yang diinput sebelumnya atau tidak
15. Terakhir Mengecheck button "Go to Homepage" muncul atau tidak dan di check juga wordingnya sesuai atau tidak

---

## 📂 Project Structure
```
SoalNomor2Web/
  ├── Profiles/
  │     └── default
  ├── Test Cases/
  │     ├── Test Case 1.1 Login with Invalid Data
  │     └── Test Case 1.2 Login with Valid Data
  │     └── Test Case 2.1 Make Appointment - without input
  │     └── Test Case 2.2 Make Appointment - Success
  ├── Test Suites/
  │     └── Soal Nomor 2 (Test Case 1.1, Test Case 1.2, Test Case 2.1, Test Case 2.2)
  ├── Object Repository/
  │     ├── Page_CURA Healthcare Service
  ├── Reports/
  │     ├── 20250228_200839
  ├── Plugins/
  ├── Include/
  └── TestOps/
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
2. **Pilih Test Suite "Soal Nomor 2 (Test Case 1.1, Test Case 1.2, Test Case 2.1, Test Case 2.2)"** yang ingin dieksekusi
3. **Klik "Run"** ▶️


## 📊 Test Report & Logs
📌 Setelah eksekusi, laporan dapat ditemukan di folder `Reports/` 

---

## 📝 License
📄 **MIT License** - Bebas digunakan dengan menyertakan atribusi.

---

## 🙌 Credits
✨ Project ini dikembangkan oleh **Muhammad Ilham Idris Junus** 💡

