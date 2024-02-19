import Foundation

func solution(_ price:Int, _ money:Int, _ count:Int) -> Int64{
    var sum = 0
    for i in 1 ... count {
        sum += i * price
    }
    if sum <= money {
        return 0
    }
    return Int64 (sum - money)
}