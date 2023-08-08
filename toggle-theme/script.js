const toggleTheme = document.getElementById("toggle-theme");

toggleTheme.addEventListener("change", (event) => {
    const checked = event.target.checked;
    if(checked) {
        document.body.style.backgroundColor = "#414f5a";
    }
    else {
        document.body.style.backgroundColor = "#FFFFFF";
    }
});