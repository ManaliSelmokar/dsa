function navigate(page) {
  document.body.style.opacity = 0;
  setTimeout(() => {
    window.location.href = page;
  }, 800);
}

document.body.style.opacity = 0;
window.onload = () => {
  document.body.style.opacity = 1;
};

const container = document.querySelector('.sparkle-container');
if (container) {
  for (let i = 0; i < 35; i++) {
    const sparkle = document.createElement('div');
    sparkle.classList.add('sparkle');
    sparkle.style.top = Math.random() * 100 + "%";
    sparkle.style.left = Math.random() * 100 + "%";
    sparkle.style.animationDuration = (Math.random() * 5 + 3) + "s";
    container.appendChild(sparkle);
  }
}

function blowCandles() {
  const flames = document.querySelectorAll('.flame');

  flames.forEach(flame => {
    const smoke = document.createElement('div');
    smoke.classList.add('smoke');
    flame.parentElement.appendChild(smoke);

    flame.style.display = "none";
  });

  setTimeout(() => {
    alert("Wish made ✨");
  }, 1500);
}
