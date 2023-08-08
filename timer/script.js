const timerEl = document.querySelector("#timer");
const btnStart = document.querySelector("#start");
const btnStop = document.querySelector("#stop");
const btnRestart = document.querySelector("#restart");

let timer = {
    min: 0,
    sec: 0,
    mil: 0,
    milSum: 0,
    interval: null
};

function startTimer(interval) {
    timer.interval = setInterval(() => {
        timer.milSum += interval;
        updatedTimer(timer);
    }, interval);
}

function updatedTimer(timer) {
    timer.min = Math.floor(timer.milSum / 60000);
    timer.sec = Math.floor((timer.milSum % 60000) / 1000);
    timer.mil = Math.floor(timer.milSum % 1000);
    timerEl.innerText = formatTimerStr(timer);
}

function formatTimerStr(timer) {
    let timerStr = "";
    let minStr = timer.min.toString().padStart(2, "0");
    let secStr = timer.sec.toString().padStart(2, "0");
    let milStr = timer.mil.toString().padStart(3, "0");
    timerStr += `${minStr}:${secStr}:${milStr}`;
    return timerStr;
}



btnStart.addEventListener("click", () => {
    if(!timer.interval) {
        startTimer(13);
    }
});

btnStop.addEventListener("click", () => {
    if(timer.interval) {
        clearInterval(timer.interval);
        timer.interval = null;
    }
});

btnRestart.addEventListener("click", () => {
    if(timer.interval) {
        clearInterval(timer.interval);
        timer.interval = null;
    }
    timer.min = 0;
    timer.sec = 0;
    timer.mil = 0;
    timer.milSum = 0;
    updatedTimer(timer);
});