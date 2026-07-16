// Last updated: 2026. 7. 16. 오전 11:25:09
/**
 * @param {number} millis
 */
async function sleep(millis) {
    return new Promise(resolve => setTimeout(() => resolve(millis), millis));
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */