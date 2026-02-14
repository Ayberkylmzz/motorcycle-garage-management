# 🏍️ Motorcycle Garage Management System

Bu proje, bir motosiklet garajının stok ve envanter yönetimini kolaylaştırmak amacıyla geliştirilmiş bir **Backend REST API** çalışmasıdır.

## 🏗️ Mimari Yapı: Katmanlı Mimari (Layered Architecture)
Proje, sürdürülebilirlik ve temiz kod prensipleri için 4 ana katman üzerine inşa edilmiştir:
- **Entity:** Veritabanı modelleri (JPA/Hibernate).
- **DataAccess (Repository):** Veri erişim işlemleri.
- **Business (Service):** İş mantığı ve kontroller.
- **Web API (Controller):** RESTful endpoint'ler.

## 🛠️ Kullanılan Teknolojiler
- **Java 21+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Hibernate**
- **Lombok**
- **H2 Database**

## 🚀 API Endpoint'leri
- `GET /api/motorcycles/getall`: Tüm motosikletleri listeler.
- `POST /api/motorcycles/add`: Yeni bir motosiklet kaydı ekler.

## 🧪 Test
Proje, frontend arayüzü yerine **Postman** kullanılarak test edilmiştir.