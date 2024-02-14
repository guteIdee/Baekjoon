func solution(_ n:Int) -> String {
  let words = ["수", "박"]
  var answer: String = ""
  
  for i in 0 ..< n {
    answer += words[i % 2]
  }
  return answer
}