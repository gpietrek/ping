package contracts
import org.springframework.cloud.contract.spec.Contract
Contract.make {
  request {
    method("POST")
    url("/hello")
    headers {
      header('Content-Type': 'application/json')
    }
    body($(test(value: "test"), stub(anyNonEmptyString())))
  }
  response {
    status 200
  }
}
