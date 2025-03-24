document.addEventListener("DOMContentLoaded", function () {
    // 画像アップロード機能
    const imageInput = document.getElementById('imageFile');
    const imagePreview = document.getElementById('imagePreview');

    if (imageInput && imagePreview) {  // 要素が存在するかチェック
        imageInput.addEventListener('change', () => {
            if (imageInput.files[0]) {
                let fileReader = new FileReader();
                fileReader.onload = () => {
                    imagePreview.innerHTML = `<img src="${fileReader.result}" class="mb-3">`;
                }
                fileReader.readAsDataURL(imageInput.files[0]);
            } else {
                imagePreview.innerHTML = '';
            }
        });
    }

    // スライドショー機能
    const images = ["/images/チャーハン.png", "/images/ラーメン.png", "/images/和食.png"];
    let currentIndex = 0;
    const imgElement = document.getElementById("dynamicImage");

    if (imgElement) {  // `id="dynamicImage"` が存在する場合のみ実行
        function changeImage() {
            imgElement.classList.add("fade-out");

            setTimeout(() => {
                currentIndex = (currentIndex + 1) % images.length;
                imgElement.src = images[currentIndex];
                imgElement.classList.remove("fade-out");
            }, 1000);
        }

        setInterval(changeImage, 7000);
    }
});
