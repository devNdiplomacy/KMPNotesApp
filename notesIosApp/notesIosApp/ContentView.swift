import SwiftUI
import sharedNotesApp

struct ContentView: View {
	let greet = Greeting().greet()

	var body: some View {
        Text(greet).onAppear(){
            let factory = IOSSqlFactory()
            let sdk = TestSdk(iSqlFactory: factory)
            sdk.startTesting()
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}