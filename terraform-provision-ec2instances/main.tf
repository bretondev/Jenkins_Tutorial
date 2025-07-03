provider "aws" {
  region = "us-east-1"
}

resource "aws_instance" "example" {
  count         = 2
  ami           = "ami-0c55b159cbfafe1f0"   # Amazon Linux 2 in us-east-1 (update as needed)
  instance_type = "t2.micro"

  tags = {
    Name = "Terraform-EC2-${count.index + 1}"
  }
}
