// Last updated: 2026. 7. 16. 오전 11:25:07
Array.prototype.last = function() {
    return this[this.length-1] ?? -1;
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */