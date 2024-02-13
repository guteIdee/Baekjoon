func solution(_ arr:[Int]) -> [Int] {
    var min = arr.min()!
    var answer = arr.filter{$0 > min}
    
    if arr.count == 1 {
        return [-1]
    }
    return answer
}