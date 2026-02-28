const wishBtn = document.getElementById("wishBtn");
const bgMusic = document.getElementById("bgMusic");
const toLetters = document.getElementById("toLetters");

/* Blow Out + Music + Scroll */
wishBtn.addEventListener("click", () => {
  const glow = document.querySelector(".cake-glow");
  glow.style.transition = "opacity 1s ease";
  glow.style.opacity = "0";

  setTimeout(() => {
    bgMusic.play();
    createConfetti();
  }, 800);

  setTimeout(() => {
    document.getElementById("gallery").scrollIntoView({ behavior: "smooth" });
  }, 1500);
});

/* Scroll to Letters */
toLetters.addEventListener("click", () => {
  document.getElementById("letters").scrollIntoView({ behavior: "smooth" });
});

/* Carousel */
let slides = document.querySelectorAll(".carousel img");
let index = 0;

setInterval(() => {
  slides[index].classList.remove("active");
  index = (index + 1) % slides.length;
  slides[index].classList.add("active");
}, 4000);

/* Confetti */
function createConfetti() {
  for (let i = 0; i < 60; i++) {
    const confetti = document.createElement("div");
    confetti.classList.add("confetti");
    confetti.style.left = Math.random() * 100 + "vw";
    confetti.style.animationDuration = 3 + Math.random() * 3 + "s";
    document.body.appendChild(confetti);

    setTimeout(() => {
      confetti.remove();
    }, 6000);
  }
}

/* Letter Modal */
const cards = document.querySelectorAll(".card");
const modal = document.getElementById("letterModal");
const letterText = document.getElementById("letterText");
const closeBtn = document.querySelector(".close");

const letters = {
  tau: "You are strength wrapped in grace. Watching you grow into who you are has been the greatest privilege.",
  aai: "You are my heart outside my body. May this year give you everything you deserve and more.",
  baba: "Keep shining, keep dreaming, keep being unstoppable. The world is yours."
};

cards.forEach(card => {
  card.addEventListener("click", () => {
    const key = card.getAttribute("data-letter");
    letterText.textContent = letters[key];
    modal.style.display = "flex";
  });
});

closeBtn.addEventListener("click", () => {
  modal.style.display = "none";
});

window.addEventListener("click", (e) => {
  if (e.target === modal) {
    modal.style.display = "none";
  }
});
