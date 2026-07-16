// Last updated: 2026. 7. 16. 오전 11:25:06
/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
	return function(x) {
        if (functions.length < 1) return x;
        for (let i=functions.length-1; i>=0; --i) {
            x = functions[i](x);
        }
        return x;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */