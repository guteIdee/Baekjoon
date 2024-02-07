func solution(_ seoul:[String]) -> String {
    var answer = ""
    for i in 0 ..< seoul.count {
        if seoul[i] == "Kim" {
            answer = "\(i)"
        }
    }
    return "김서방은 \(answer)에 있다"
}