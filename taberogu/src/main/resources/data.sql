--categoryテーブル--
INSERT IGNORE INTO category (id, name, created_at, updated_at) VALUES (1, '和食', '2025-03-13', '2025-03-13');
INSERT IGNORE INTO category (id, name, created_at, updated_at) VALUES (2, '洋食', '2025-03-13', '2025-03-13');
INSERT IGNORE INTO category (id, name, created_at, updated_at) VALUES (3, '中華', '2025-03-13', '2025-03-13');

--restaurantテーブル--
INSERT IGNORE INTO restaurant (id, category_id, name, image_name,description,hours,price,postal_code,address,phone_number,regular_holiday) VALUES (1, 1, '百菜', 'images001.jpg','ファミリー層に人気！様々な和食を堪能でき栄養満点な食事ができます。','10時00分～23時00分',3000,'×××-×××','長崎県佐世保市','090-1234-567','水曜日');
INSERT IGNORE INTO restaurant (id, category_id, name, image_name,description,hours,price,postal_code,address,phone_number,regular_holiday) VALUES (2, 2, '時代屋', 'images.jpg','ジューシーなハンバーグが人気のお店。デミグラスがかかっており昔から愛されている老舗です。','9時00分～14時00分',3000,'×××-×××','長崎県佐世保市','090-1234-567','土日祝');
INSERT IGNORE INTO restaurant (id, category_id, name, image_name,description,hours,price,postal_code,address,phone_number,regular_holiday) VALUES (3, 3, '中華や', 'mm6272.jpg','チャーハンがおいしいです。注文して5分で持ってきてくれるスピード。平日のお昼時はサラリーマンでいっぱい。','11時00分～15時00分',3000,'×××-×××','長崎県佐世保市','090-1234-567','土日祝');

-- rolesテーブル
INSERT IGNORE INTO roles (id, name) VALUES (1, 'ROLE_GENERAL');
INSERT IGNORE INTO roles (id, name) VALUES (2, 'ROLE_ADMIN');

-- usersテーブル
INSERT IGNORE INTO users (id, name, furigana, email, password, role_id, enabled) VALUES (1, '侍 太郎', 'サムライ タロウ',  'taro.samurai@example.com', '$2a$10$2JNjTwZBwo7fprL2X4sv.OEKqxnVtsVQvuXDkI8xVGix.U3W5B7CO', 1, true);
INSERT IGNORE INTO users (id, name, furigana, email, password, role_id, enabled) VALUES (2, '侍 花子', 'サムライ ハナコ',  'hanako.samurai@example.com', '$2a$10$2JNjTwZBwo7fprL2X4sv.OEKqxnVtsVQvuXDkI8xVGix.U3W5B7CO', 2, true);