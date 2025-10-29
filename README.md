# 📱 Ứng dụng Quản Lý Danh Bạ (Contact Manager)

Ứng dụng Android đơn giản giúp **quản lý danh bạ cá nhân**, với các chức năng **Thêm, Sửa, Xóa và Tìm kiếm** theo thời gian thực — lưu trữ bằng **SharedPreferences (JSON)**.  
Ứng dụng được thiết kế theo phong cách **Material Design**, trực quan và dễ sử dụng.

---

## 🚀 Tính năng chính

### 🏠 Màn hình chính (MainActivity)
- Hiển thị **danh sách danh bạ** trong `RecyclerView`
- Có thanh **tìm kiếm realtime** (lọc theo tên)
- Nút **➕ FloatingActionButton** để mở màn hình thêm danh bạ
- Hiển thị danh bạ với:
  - Avatar tròn
  - Họ tên, số điện thoại, email
  - Nút ✏️ Sửa và 🗑️ Xóa ngay trên từng item

📸 **Giao diện chính:**

<img width="372" src="https://github.com/user-attachments/assets/53feed3f-07ed-4aad-8c2c-f0175d57edcf" />

---

### ➕ Màn hình thêm / chỉnh sửa danh bạ (Add/Edit)
- Có các trường nhập:
  - 🧑‍💼 Họ tên
  - 📞 Số điện thoại
  - 📧 Email
- Nút **💾 Lưu danh bạ**
- Khi bấm "Sửa" từ danh sách, dữ liệu tự **fill vào form**
- Sau khi lưu → quay lại trang chính, dữ liệu cập nhật ngay

📸 **Thêm danh bạ:**

<img width="368" src="https://github.com/user-attachments/assets/ff3f6e88-9a5b-425d-b95d-891f62272267" />

📸 **Chỉnh sửa danh bạ (tự fill dữ liệu):**

<img width="366" src="https://github.com/user-attachments/assets/1a477639-c81d-485d-940a-ee9c150abba3" />

---

### ❌ Xóa danh bạ
- Nhấn nút 🗑️ trong item để xóa nhanh
- Dữ liệu sẽ được cập nhật lại trong SharedPreferences

📸 **Xóa danh bạ:**

<img width="367" src="https://github.com/user-attachments/assets/8839af40-6b83-4a7d-a6d9-05649c757777" />

---

## 💾 Cấu trúc lưu trữ dữ liệu

Tất cả danh bạ được lưu trong SharedPreferences ở dạng JSON:

```json
[
  {
    "name": "An",
    "phone": "0123456789",
    "email": "an@gmail.com"
  },
  {
    "name": "Bình",
    "phone": "0987654321",
    "email": "binh@gmail.com"
  }
]

---
⚙️ Cấu trúc thư mục dự án

app/
├── java/com/example/contactmanager/
│   ├── MainActivity.java
│   ├── AddContactActivity.java
│   ├── Contact.java
│   ├── ContactAdapter.java
│   └── PrefsHelper.java
└── res/
    ├── layout/
    │   ├── activity_main.xml
    │   ├── activity_add_contact.xml
    │   └── item_contact.xml
    ├── drawable/
    │   ├── ic_person.xml
    │   ├── bg_avatar.xml
    │   ├── bg_item_selector.xml
    │   └── bg_search.xml

