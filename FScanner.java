


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class FScanner {
	final private int BUFFER_SIZE = 1 << 16;
	private DataInputStream din;
	private byte[] buffer;
	private int bufferPointer, bytesRead;

	public FScanner() {
		din = new DataInputStream(System.in);
		buffer = new byte[BUFFER_SIZE];
		bufferPointer = bytesRead = 0;
	}

	public FScanner(String fileName) throws IOException {
		din = new DataInputStream(new FileInputStream(fileName));
		buffer = new byte[BUFFER_SIZE];
		bufferPointer = bytesRead = 0;
	}

	public String nLine() throws IOException {
		byte[] buf = new byte[64];
		int cnt = 0, c;
		while ((c = n()) != -1) {
			if (c == '\n') break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}

	public int nInt() throws IOException {
		int ret = 0;
		byte c = n();
		while (c <= ' ')
			c = n();
		boolean neg = (c == '-');
		if (neg) c = n();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = n()) >= '0' && c <= '9');
		return (neg) ? -ret : ret;
	}

	public long nLong() throws IOException {
		long ret = 0;
		byte c = n();
		while (c <= ' ')
			c = n();
		boolean neg = (c == '-');
		if (neg) c = n();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = n()) >= '0' && c <= '9');
		return (neg) ? -ret : ret;
	}

	public double nDouble() throws IOException {
		double ret = 0, div = 1;
		byte c = n();
		while (c <= ' ')
			c = n();
		boolean neg = (c == '-');
		if (neg) c = n();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = n()) >= '0' && c <= '9');
		if (c == '.') {
			while ((c = n()) >= '0' & c <= '9') {
				ret += (c - '0') / (div *= 10);
			}
		}

		return (neg) ? -ret : ret;
	}

	private void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if (bytesRead == -1) buffer[0] = -1;
	}

	private byte n() throws IOException {
		if (bufferPointer == bytesRead) fillBuffer();
		return buffer[bufferPointer++];
	}

	public void close() throws IOException {
		if (din == null) return;
		din.close();
	}
}
