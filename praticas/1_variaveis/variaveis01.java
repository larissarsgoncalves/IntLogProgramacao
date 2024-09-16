function perfectNumbers(max) {
    var i, j, k,
        perfects = [];

    for (i = 0; i++ < max;) {
        for (j = k = 0; ++j < i;) {
            if (i % j === 0) {
                k += j;
            }
        }

        if (k === i) {
            perfects.push(k);
        }
    }

    return perfects.join(', ');
}

alert('Números perfeitos de 1 a 5000:' + perfectNumbers(5000));