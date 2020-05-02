package contracts
import org.springframework.cloud.contract.spec.Contract
Contract.make {
  request {
    method("POST")
    url("/ping")
    headers {
      header('Content-Type': 'application/my-content-type+json')
    }
    body($(test(value: "test"), stub(anyNonEmptyString())))
  }
  response {
    status 200
  }
}
