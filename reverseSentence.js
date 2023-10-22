
let reverse = (sentence) => {
    //displayed original sentence
    console.log(sentence);

    //converted string to words of array using split by space
    let words = sentence.split(" ");
    // console.log(words.reverse());

    let reverseWords = words.map(word => {
        // console.log(w.split('').reverse().join(''))

        //converted word to character of array and call reverse() on array the join() the charactor
        return word.split('').reverse().join('')
    })

    return reverseWords.join(' ');
}


//Call reverse()
console.log(reverse("This is a sunny day"))