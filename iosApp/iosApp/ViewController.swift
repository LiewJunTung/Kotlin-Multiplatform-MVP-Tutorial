import UIKit
import app

class ViewController: UIViewController, LoginView {

    var presenter: LoginPresenter? = nil
    @IBOutlet weak var textView: UILabel!
    @IBOutlet weak var editText: UITextField!

    @IBAction func clickSubmitButton(_ sender: Any) {
        presenter?.processLogin(password: editText.text ?? "")
    }

    func loginResult(result: String) {
        textView.text = result
    }

    override func viewDidLoad() {
        super.viewDidLoad()
        presenter = LoginPresenterImpl(loginView: self)
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    @IBOutlet weak var label: UILabel!
}
