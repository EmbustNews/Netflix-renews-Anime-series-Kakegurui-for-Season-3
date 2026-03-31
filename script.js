const shareBtn = document.querySelector(".share");

shareBtn.addEventListener("click", () => {
    const url = window.location.href;

    navigator.clipboard.writeText(url)
        .then(() => {
            alert("Share link copied to clipboard!");
        })
        .catch(err => {
            console.error("Failed to copy link.", err);
        });
});