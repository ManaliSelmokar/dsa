const audio = document.getElementById("bgMusic");

/* Restore Music */
if(localStorage.getItem("musicTime")){
  audio.currentTime = localStorage.getItem("musicTime");
  audio.play();
}

/* Save music time */
setInterval(()=>{
  localStorage.setItem("musicTime", audio.currentTime);
},1000);

/* Cake 3D tilt */
const cake = document.querySelector(".cake-3d");
if(cake){
  document.addEventListener("mousemove",(e)=>{
    const x = (window.innerWidth/2 - e.pageX)/25;
    const y = (window.innerHeight/2 - e.pageY)/25;
    cake.style.transform = `rotateY(${x}deg) rotateX(${y}deg)`;
  });
}

/* Wish Button Transition */
const wishBtn = document.getElementById("wishBtn");
if(wishBtn){
  wishBtn.addEventListener("click",()=>{
    document.querySelector(".glow").style.opacity="0";
    audio.play();
    setTimeout(()=>{
      document.querySelector(".overlay-transition").style.opacity="1";
      setTimeout(()=>{
        window.location.href="gallery.html";
      },1200);
    },800);
  });
}

/* Gallery to Letters */
const toLetters = document.getElementById("toLetters");
if(toLetters){
  toLetters.addEventListener("click",()=>{
    document.querySelector(".overlay-transition").style.opacity="1";
    setTimeout(()=>{
      window.location.href="letters.html";
    },1200);
  });
}
