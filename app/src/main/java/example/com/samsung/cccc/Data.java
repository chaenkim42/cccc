package example.com.samsung.cccc;

import android.util.Log;

/**
 * Created by samsung on 4/17/2018.
 */

public class Data {

    static String[] words = {
            "Fragment",
            "Activity",
            "ListView",
            "Adapter",
            "View",
            "TextView",
            "ListAdapter",
            "ImageView",
            "LayoutInflater",
            "MenuInflater",
            "Window",
            "Log",
            "Property",
            "ArraySet",
            "TimeUtils",
            "ActionBar",
            "ActivityManager",
            "AlarmManager",
            "AlertDialog",
            "Dialog",
            "DialogFragment",
            "FragmentManager",
            "IntentService",
            "LauncherActivity",
            "Service",
            "Context",
            "Intent",
            "Object"

    };

    static String[] definitions = {
            "프래그먼트(fragment)는 하니콤 버전(API 버전 11)부터 추가된 기능이다. 프래그먼트는 태블릿과 같은 넓은 화면을 가지는 모바일 장치를 위한 		매카니즘이다.",
            "액티비티(activity)는 사용자 인터페이스 화면을 가지는 하나의 작업을 담당하는 		컴포넌트이다.",
            "ListView는 스크롤 가능한 항목의 목록을 표시하는 뷰 그룹입니다.",
            "Adapter 객체는 AdapterView해당 뷰에 대한 기본 데이터와 해당 뷰 간의 연결 역할을합니다. 어댑터는 데이터 항목에 대한 액세스를 제공합니다.",
            "이 클래스는 사용자 인터페이스 구성 요소의 기본 구성 요소를 나타냅니다. 뷰는 화면의 직사각형 영역을 차지하며 그리기 및 이벤트 처리를 담당합니다.",
            "사용자에게 텍스트를 표시하는 사용자 인터페이스 요소이다.",
            "확장 Adapter은 a ListView 와 목록을 백업하는 데이터 사이의 다리 입니다. 종종 데이터는 커서에서 가져 오지만 필수는 아닙니다. ListView는 ListAdapter에 래핑 된 모든 데이터를 표시 할 수 있습니다.",
            "이미지 리소스를 표시 Bitmap 또는 Drawable자원. ImageView도 일반적으로 사용 apply tints to an image되며 처리 image scaling됩니다.",
            "레이아웃 XML 파일을 해당 View 객체로 인스턴스화합니다. 직접적으로 사용되지 않습니다. 대신에 getLayoutInflater () 또는 getSystemService (Class)를 사용하여 이미 현재 컨텍스트에 연결되어 있다",
            "이 클래스는 메뉴 XML 파일을 Menu 객체로 인스턴스화하는 데 사용됩니다.",
            "톱 레벨의 윈도우의 외관과 동작 정책의 추상 기본 클래스입니다. 이 클래스의 인스턴스는 창 관리자에 추가 된 최상위보기로 사용해야합니다. 배경, 제목 영역, 기본 키 처리 등과 같은 표준 UI 정책을 제공합니다.",
            "로그 출력을 보내기위한 API. 일반적으로 로그를 작성하려면 Log.v (), Log.d (), Log.i (), Log.w () 및 Log.e () 메서드를 사용해야합니다. 그런 다음 logcat에서 로그를 볼 수 있습니다.",
            "속성은 호스트 개체에 보관되는 변경 가능한 값을 나타내는 데 사용할 수있는 추상화입니다. 속성의 set (Object, Object) 또는 get (Object) 메서드는 호스트 객체의 비공개 필드 또는 \"setter\"및 \"getter\"메서드를 통해 구현하거나 다른 메커니즘을 통해 구현할 수 있습니다.",
            "ArraySet은 전통적인 HashSet보다 메모리 효율이 높도록 설계된 일반적인 세트 데이터 구조입니다. 이 디자인은 ArrayMap과 매우 유사하며 모든 문제점이 설명되어 있습니다. 그러나이 구현은 ArrayMap과 별개이므로 Object 배열에는 매핑의 쌍 대신에 집합의 각 항목에 대해 하나의 항목 만 포함됩니다.",
            "표준 시간대와 관련된 유틸리티 메서드가 포함 된 클래스입니다.",
            "액티비티 제목, 애플리케이션 레벨 네비게이션 어포던스 및 기타 대화식 항목을 표시 할 수있는 액티비티의 기본 툴바.",
            "이 클래스는 활동, 서비스 및 포함 프로세스에 대한 정보를 제공하고 상호 작용합니다.",
            "이 클래스는 시스템 알람 서비스에 대한 액세스를 제공합니다. 이것들을 사용하여 미래의 어느 시점에서 응용 프로그램이 실행되도록 예약 할 수 있습니다. 알람이 울리면 등록 된 인 텐트가 시스템에 의해 브로드 캐스트되고 대상 응용 프로그램이 이미 실행되고 있지 않으면 자동으로 시작됩니다. 등록 된 알람은 장치가 잠 들어있을 때까지 유지되며 (해당 시간 동안 장치가 꺼지면 장치를 깨울 수 있음), 장치를 끄고 재부팅하면 제거됩니다.",
            "하나, 둘 또는 세 개의 버튼을 표시 할 수있는 Dialog의 서브 클래스입니다. 이 대화 상자에 문자열 만 표시하려면 setMessage () 메서드를 사용하십시오.",
            "대화 상자의 기본 클래스입니다.",
            "활동 창의 상단에 떠있는 대화 상자 창을 표시하는 조각입니다. 이 프래그먼트에는 Dialog 객체가 포함되어 있으며 프래그먼트의 상태에 따라 적절히 표시됩니다. 대화 상자의 제어 (표시, 숨기기, 해제)는 대화 상자에서 직접 호출하지 않고 API를 통해 수행해야합니다.",
            "액티비티 내부의 Fragment 객체와 상호 작용하기위한 인터페이스",
            "IntentService는 요청시 비동기 요청 (인 텐트로 표시됨)을 처리하는 서비스의 기본 클래스입니다. 클라이언트는 startService (Intent) 호출을 통해 요청을 보냅니다. 서비스는 필요에 따라 시작되고, 작업자 스레드를 사용하여 차례로 각 인 텐트를 처리하고 작업이 종료되면 자체를 중지합니다.",
            "주어진 의도에 대해 수행 할 수있는 모든 활동 목록을 표시합니다. 클릭하면 실행됩니다.",
            "서비스는 사용자와 상호 작용하지 않고 장기 실행 작업을 수행하거나 다른 응용 프로그램이 사용할 기능을 제공하려는 응용 프로그램의 요구를 나타내는 응용 프로그램 구성 요소입니다. ",
            "응용 프로그램 환경에 대한 전역 정보에 대한 인터페이스. 이것은 Android 시스템에서 구현 된 추상 클래스입니다. 애플리케이션 별 리소스 및 클래스에 대한 액세스는 물론 활동 시작, 방송 및 수신 의도와 같은 애플리케이션 수준 작업에 대한 호출을 허용합니다.",
            "인 텐트는 수행 할 작업의 추상 설명입니다. startActivity를 사용하여 Activity를 시작하고, 관심있는 BroadcastReceiver 구성 요소로 보내려면 broadcastIntent를, 백그라운드 서비스와 통신하려면 startService (Intent) 또는 bindService (Intent, ServiceConnection, int)와 함께 사용할 수 있습니다.",
            "클래스 Object는 클래스 계층 구조의 루트입니다. 모든 클래스에는 수퍼 클래스로 Object가 있습니다. 배열을 포함한 모든 객체는이 클래스의 메서드를 구현합니다.\n"

    };

    public static int searchItem(String searchString) {
        for(int i=0; i< words.length; i++){
            if(searchString.toLowerCase().equals(words[i].toLowerCase())) {
//                Log.d("stag","words "+words[i]+" ss "+searchString);
                return i;
            }
        }
        return -1;
    }
}

