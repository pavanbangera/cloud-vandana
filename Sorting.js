// we can easily sort an array using sort() method

const array = [5, 2, 9, 3, 6]; //Input

array.sort(function (i, j) {
    return j - i; // Compare two items of the array as (i,j)-> for desending (j-i)->for asending (i-j)
});

console.log(array); // Outputs