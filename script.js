<script>
document.querySelector(".share").addEventListener("click", () => {
    navigator.share({
        title: document.title,
        url: window.location.href
    });
});
</script>
