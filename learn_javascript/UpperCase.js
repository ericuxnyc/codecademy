function firstLetterToUpperCase() {
    let str = " How can mirrors be real if our eyes aren't real";

    let arr = str.split(" ");
    console.log(arr)
    let capitalLetters = arr.map((item) => item.toUpperCase());
    console.log(capitalLetters);

}
firstLetterToUpperCase();