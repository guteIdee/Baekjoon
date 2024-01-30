func solution(_ x:Int, _ n:Int) -> [Int64] {
    var answer = Array<Int64>()
    var sum: Int64 = 0
    for i in 1 ... n {
        sum += Int64(x)
        answer.append(sum)
    }
    return answer
}