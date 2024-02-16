import Foundation

func solution(_ left:Int, _ right:Int) -> Int {
    var answer = 0
    for i in left ... right {
        var n = 0   //약수 개수
        for j in 1 ... i {
            if i % j == 0 {
                n += 1;
            }
        }
        if n % 2 == 0 {
            answer += i
        }
        else {
            answer -= i
        }
    }
    return answer
}