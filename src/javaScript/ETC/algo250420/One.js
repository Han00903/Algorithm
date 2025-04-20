function solution(numbers) {
    let length = numbers.length;
    let sum =0;

    for(let i=0; i<length ; i++){
        sum += numbers[i];
    }

    let answer = sum/length;

    return answer;
}