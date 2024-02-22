func solution(_ n:Int, _ m:Int) -> [Int] {
    var gdc = 0
    var answer: [Int] = []
    
    for i in 1 ... min(n, m) {
        if n % i == 0 && m % i == 0 {
            gdc = i
        }
    }
    answer.append(gdc)
    answer.append(n * m / gdc)
    
    return answer
}